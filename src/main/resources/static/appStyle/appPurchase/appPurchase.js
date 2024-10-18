

const addProductBtn = document.getElementById('addProductBtn');
const productTable = document.getElementById('productTable').querySelector('tbody');
const totalAmountSpan = document.getElementById('totalAmount');

let totalAmount = 0; // Variável para acumular o total geral

addProductBtn.addEventListener('click', () => {
    const productName = document.getElementById('productName').value;
    const barcode = document.getElementById('barcode').value;
    const lotNumber = document.getElementById('lotNumber').value;
    const quantity = parseFloat(document.getElementById('quantity').value);
    const shelf = document.getElementById('shelf').value;
    const expiryDate = document.getElementById('expiryDate').value;
    const alertDays = parseInt(document.getElementById('alertDays').value);
    const price = parseFloat(document.getElementById('price').value);
    const salePrice = parseFloat(document.getElementById('salePrice').value);

    // Validar se os campos necessários estão preenchidos
    if (productName && barcode && lotNumber && quantity > 0 && expiryDate && alertDays >= 0 && price >= 0) {
        const total = quantity * price; // Calcular o total do produto
        totalAmount += total; // Atualizar o total geral

        // Criação da nova linha com os dados do produto
        const newRow = `
        <tr>
            <td>${productName}</td>
            <td>${barcode}</td> <!-- Código de barras dinâmico -->
            <td>${lotNumber}</td> <!-- Número de lote dinâmico -->
            <td>${quantity}</td>
            <td>${shelf}</td> <!-- Prateleira dinâmico -->
            <td>${expiryDate}</td> <!-- Data de validade -->
            <td>${alertDays}</td> <!-- Dias de alerta dinâmico -->
            <td>${price.toFixed(2)}</td>
            <td>${salePrice.toFixed(2)}</td> <!-- Preço de venda -->
            <td>${total.toFixed(2)}</td>
            <td>
                <a class="smallButton" id"editProductButton" href="#genericProductFormID"><i class="fas fa-edit" style="cursor:pointer; margin-right: 10px;"></i></a>
                <a class="smallButton" href="#"><i class="fas fa-trash" onclick="deleteProduct(this)" style="cursor:pointer;"></i></a>
            </td>
        </tr>
        `;

        // Inserir a nova linha na tabela
        productTable.insertAdjacentHTML('beforeend', newRow);

        // Atualizar o campo de exibição do total geral
        totalAmountSpan.textContent = totalAmount.toFixed(2);

        // Limpar os campos do formulário após a submissão
        document.querySelector('.standardForm').reset();
    }
});

// Função para eliminar um produto
function deleteProduct(element) {
    const row = element.closest('tr');
    const productTotal = parseFloat(row.querySelectorAll('td')[9].textContent);

    // Atualizar o total geral subtraindo o valor do produto eliminado
    totalAmount -= productTotal;

    // Atualizar o campo de exibição do total geral
    totalAmountSpan.textContent = totalAmount.toFixed(2);

    // Remover a linha da tabela
    row.remove();
}
