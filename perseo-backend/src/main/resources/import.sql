Usuarios
INSERT INTO usuarios (dni, nombre, apellido, sexo, telefono_cel, email, fecha_nacimiento, calle_domicilio, altura_domicilio, localidad, provincia) VALUES (35621451, 'Santiago Martín', 'Suárez', 'Masculino', 2235362080, 'santy_9_91@hotmail.com', '1991-04-01', 'Avenida J.J. Paso', 3272, 'Mar del Plata', 'Buenos Aires');


Roles
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');
INSERT INTO `roles`(nombre) VALUES ('ROLE_USER');

INSERT INTO usuarios_roles (usuarios_dni, roles_id) VALUES (35621451,1);