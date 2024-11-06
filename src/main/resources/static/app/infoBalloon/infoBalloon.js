
// Seleciona todos os elementos com a classe 'existence'
document.querySelectorAll('.existence').forEach(existence => {
    existence.addEventListener('click', function(event) {
        // Encontra o elemento '.totalExistence' mais próximo no mesmo fieldset
        const totalExistence = event.target.closest('.productContent').querySelector('.totalExistence');

        // Alterna a visibilidade do tooltip
        if (totalExistence.style.display === 'none' || totalExistence.style.display === '') {
            totalExistence.style.display = 'block';
        } else {
            totalExistence.style.display = 'none';
        }
    });
});
