// Função para atualizar a quantidade de um campo específico
function updateQuantity(input, change) {
    let newQuantity = parseInt(input.value || 1) + change;
    input.value = newQuantity > 0 ? newQuantity : 1; // Garante que a quantidade mínima é 1
}

// Função de validação para garantir que o valor é numérico e no mínimo 1
function validateQuantity(input) {
    input.value = input.value.replace(/[^0-9]/g, ''); // Remove caracteres não numéricos
    if (input.value === '' || parseInt(input.value) < 1) {
        input.value = 1; // Corrige para 1 se estiver vazio ou menor que 1
    }
}

// Seleciona todos os contêineres de quantidade e adiciona eventos aos botões e inputs
document.querySelectorAll('.quantity-container').forEach(container => {
    const quantityInput = container.querySelector('.quantity');
    const decrementButton = container.querySelector('.quantity-btn:first-child');
    const incrementButton = container.querySelector('.quantity-btn:last-child');

    // Event listener para o botão de decremento
    decrementButton.addEventListener('click', () => updateQuantity(quantityInput, -1));

    // Event listener para o botão de incremento
    incrementButton.addEventListener('click', () => updateQuantity(quantityInput, 1));

    // Event listener para validação de entrada
    quantityInput.addEventListener('input', () => validateQuantity(quantityInput));
});
