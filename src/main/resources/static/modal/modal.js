
// Seleciona todos os botões que abrem o modal e o overlay do modal
const openModalButtons = document.querySelectorAll('.open-modal');
const closeModalButtons = document.querySelectorAll('.close-modal');
const modalOverlay = document.querySelector('.modal-overlay');

// Função para abrir o modal
function openModal() {
    modalOverlay.style.display = 'flex';
}

// Função para fechar o modal
function closeModal() {
    modalOverlay.style.display = 'none';
}

// Adiciona evento de clique em cada botão para abrir o modal
openModalButtons.forEach(button => {
    button.addEventListener('click', openModal);
});

// Adiciona evento de clique em cada botão de fechar para fechar o modal
closeModalButtons.forEach(button => {
    button.addEventListener('click', closeModal);
});

// Fecha o modal se o usuário clicar fora do conteúdo
modalOverlay.addEventListener('click', (event) => {
    if (event.target === modalOverlay) {
        closeModal();
    }
});
