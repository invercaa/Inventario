//FUNCION PARA CREAR EL CARD DE CARGANDO
function cargando(tableId) {
	var div = document.createElement('div');
	div.classList = 'spinner-border m-5"';
	div.setAttribute = 'role', 'status';

	var span = document.createElement('span');
	span.classList = 'sr-only';
	span.textContent = 'Loading...';

	div.appendChild(span);
	$('#' + tableId + '_processing').append(div);	
};
