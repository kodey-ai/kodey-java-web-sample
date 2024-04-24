document.addEventListener('DOMContentLoaded', function() {
    const form = document.querySelector('form');
    form.onsubmit = function(event) {
        event.preventDefault();
        const formData = new FormData(form);
        fetch('StudentServlet', {
            method: 'POST',
            body: formData
        }).then(response => response.text())
          .then(data => alert('Form submitted successfully!'))
          .catch(error => console.error('Error:', error));
    };
});