function agregarProducto() {
	document.getElementById('agregar-producto').classList.add('active');
	document.getElementById('fondo').classList.add('superponer-fondo');
	
}

function cancelarAgregarProducto(){
	document.getElementById('agregar-producto').classList.remove('active');
	document.getElementById('fondo').classList.remove('superponer-fondo');
}

function agregarTipoProducto() {
	var myModal = new bootstrap.Modal(document.getElementById('tipo-producto'));
	myModal.show();
//	document.getElementById('agregar-producto').classList.add('active');
//	document.getElementById('fondo').classList.add('superponer-fondo');

	
}

function cancelarTipoAgregarProducto(){
//	document.getElementById('agregar-producto').classList.remove('active');
//	document.getElementById('fondo').classList.remove('superponer-fondo');
}