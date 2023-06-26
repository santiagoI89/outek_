/*const toggleMenuElement = document.getElementById('toggle-menu');
const mainMenuElement = document.getElementById('main-menu');

toggleMenuElement.addEventListener('click', ()=>{
   mainMenuElement.classList.toggle('main-menu--show'); 
});*/

/* global bootstrap: false */
/*(() => {
  'use strict'
  const tooltipTriggerList = Array.from(document.querySelectorAll('[data-bs-toggle="tooltip"]'))
  tooltipTriggerList.forEach(tooltipTriggerEl => {
    new bootstrap.Tooltip(tooltipTriggerEl)
  })
})()*/

var dropdownButtons = document.querySelectorAll('.dropdown-btn');

dropdownButtons.forEach(function(button) {
  button.addEventListener('click', function() {
    this.nextElementSibling.classList.toggle('active');
  });
});
