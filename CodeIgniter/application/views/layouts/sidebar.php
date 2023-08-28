      <!-- Main Sidebar Container -->
      <aside class="main-sidebar sidebar-dark-primary elevation-4">
        <!-- Brand Logo -->
        <a href="index3.html" class="brand-link">
          <img src="<?= base_url('dist/img/AdminLTELogo.png') ?>" alt="AdminLTE Logo" class="brand-image img-circle elevation-3" style="opacity: .8">
          <span class="brand-text font-weight-light">Proyecto MVC</span>
        </a>

        <!-- Sidebar -->
        <div class="sidebar">
          <!-- Sidebar user panel (optional) -->
          <div class="user-panel mt-3 pb-3 mb-3 d-flex">
            <div class="image">
              <img src="<?= base_url('dist/img/users/'.$session['foto']) ?>" class="img-circle elevation-2" alt="User Image">
            </div>
            <div class="info">
              <a href="#" class="d-block"><?= explode(" ", $session['nombres'])[0]." ".explode(" ", $session['apellidos'])[0] ?></a>
            </div>
          </div>

          <!-- Sidebar Menu -->
          <nav class="mt-2">
            <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
              <li class="nav-header">MENU ADMIN</li>
              <li class="nav-item">
                <a href="<?= base_url('index.php/admin/Inicio/openCreateUser') ?>" class="nav-link  <?php ($optionSelected=='openCreateUser')? 'active' : ''?>">
                 <i class="fas fa-user-plus"></i>
                  <p>
                    Crear Usuario
                  </p>
                </a>
              </li>
              <li class="nav-item">
                <a href="<?= base_url('index.php/admin/Inicio/openlistUsers') ?>" class="nav-link <?php ($optionSelected=='openlistUsers')? 'active' : ''?>">
                 <i class="fas fa-list"></i>
                  <p>
                    Ver Usuarios
                  </p>
                </a>
              </li>
              <li class="nav-item">
                <a href="<?= base_url('index.php/admin/Inicio/editUsers') ?>" class="nav-link <?php ($optionSelected=='editUsers')? 'active' : ''?>">
                 <i class="fas fa-edit"></i>
                  <p>
                    Modificar Usuario
                  </p>
                </a>
              </li>
              <li class="nav-item">
                <a href="<?= base_url('index.php/admin/Inicio/deleteUsers') ?>" class="nav-link <?php ($optionSelected=='deleteUsers')? 'active' : ''?>">
                 <i class="fas fa-trash"></i>
                  <p>
                    Eliminar Usuario
                  </p>
                </a>
              </li>
              <li class="nav-item">
                <a href="<?= base_url('index.php/Login/cerrarSession') ?>" class="nav-link <?php ($optionSelected=="")? 'active' : ''?>">
                 <i class="fas fa-sign-out-alt"></i>
                  <p>
                    Cerrar Sesion
                  </p>
                </a>
              </li>

            </ul>
          </nav>
          <!-- /.sidebar-menu -->
        </div>
        <!-- /.sidebar -->
      </aside>