<?php
 $dataHeader['titulo'] = "Crear Usuarios";
 $this->load->view('layouts/header', $dataHeader);
?>
  <?php
    $dataSidebar['session'] = $session;
    $dataSidebar['optionSelected'] = 'openCreateUser';
    $this->load->view('layouts/sidebar', $dataSidebar);
  ?>
  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    
    <div class="col-12 row m-0 p-0 justify-content-center">
      <h1 class="text-dark text-center">FORMULARIO DE CREACION DE USUARIO</h1>
      <div class="col-12 col-lg-5 mt-3 p-3 px-5 border">
        <form action="<?= base_url('index.php/Registro_User/') ?>" method="POST">
          <!-- Campo Documento -->
          <label for="campo_documento" class="form-label m-0"><b>Documento:</b></label>
          <input class="form-control <?= (isset($valueDocumento) && $valueDocumento!='')? 'is-valid': ((isset($errorInData))? 'is-invalid':'') ?>" id="campo_documento" type="email" name="campo_documento" value="<?= (isset($valueDocumento))? $valueDocumento : '' ?>">
          <!-- Campo Nombres -->
          <label for="campo_nombre" class="form-label m-0"><b>Nombres:</b></label>
          <input class="form-control <?= (isset($valueNombre) && $valueNombre!='')? 'is-valid': ((isset($errorInData))? 'is-invalid':'') ?>" id="campo_nombre" type="email" name="campo_nombre" value="<?= (isset($valueNombre))? $valueDocumento : '' ?>">
          <!-- Campo Apellidos -->
          <label for="campo_apellido" class="form-label m-0"><b>Apellidos:</b></label>
          <input class="form-control <?= (isset($valueApellido) && $valueApellido!='')? 'is-valid': ((isset($errorInData))? 'is-invalid':'') ?>" id="campo_apellido" type="email" name="campo_apellido" value="<?= (isset($valueApellido))? $valueDocumento : '' ?>">
          <!-- Campo Telefono -->
          <label for="campo_telefono" class="form-label m-0"><b>Telefono:</b></label>
          <input class="form-control <?= (isset($valueTelefono) && $valueTelefono!='')? 'is-valid': ((isset($errorInData))? 'is-invalid':'') ?>" id="campo_telefono" type="email" name="campo_telefono" value="<?= (isset($valueTelefono))? $valueDocumento : '' ?>">
          <!-- Campo  Direccion -->
          <label for="campo_direccion" class="form-label m-0"><b>Direccion:</b></label>
          <input class="form-control <?= (isset($valueDireccion) && $valueDireccion!='')? 'is-valid': ((isset($errorInData))? 'is-invalid':'') ?>" id="campo_direccion" type="email" name="campo_direccion" value="<?= (isset($valueDireccion))? $valueDocumento : '' ?>">

          <!-- <label for="campo_password" class="form-label m-0 mt-3"><b>Password:</b></label>
          <input class="form-control <?= (isset($valueDocumento) && $valuePassword!='')? 'is-valid': ((isset($errorInData))? 'is-invalid':'') ?>" id="campo_password" type="password" name="campo_password" value="<?= (isset($valuePassword))? $valuePassword : '' ?>"> -->

          <div class="row m-0 mt-3 p-0 justify-content-center">
            <div class="col-12 col-lg-6 m-0 p-0">
              <button class="col-12 btn btn-success" type="submit">Registrarse</button>
            </div>
          </div>
        </form>
      </div>
    </div>
  </div>

<?php
  $this->load->view('layouts/footer')
?>




      
 
