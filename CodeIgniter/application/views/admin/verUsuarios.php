<?php
 $dataHeader['titulo'] = "Ver Usuarios";
 $this->load->view('layouts/header', $dataHeader);
?>
  <?php
    $dataSidebar['session'] = $session;
    $dataSidebar['optionSelected'] = 'openlistUsers';
    $this->load->view('layouts/sidebar', $dataSidebar);
  ?>
  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <div class="col-12 m-0 p-3">
      <h1 class="text-dark text-center">TABLA CON LISTA DE USUARIOS</h1>
      <table class="table">
          <thead>
            <tr>
              <th scope="col">Documento</th>
              <th scope="col">Nombres</th>
              <th scope="col">Apellidos</th>
              <th scope="col">Telefono</th>
              <th scope="col">Direccion</th>
              <th scope="col">Email</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <th></th>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
              <td></td>
            </tr>
          </tbody>
      </table>
    </div>
  </div>
<?php
  $this->load->view('layouts/footer')
?>




      
 
