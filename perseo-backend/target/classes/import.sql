#PlanesOS
INSERT INTO planesos (nombre) VALUES ('Osde 210');

#Usuarios
INSERT INTO usuarios (dni, nombre, apellido, sexo, telefono_cel, email, fecha_nacimiento, calle_domicilio, altura_domicilio, localidad, provincia) VALUES (35621451, 'Santiago Martín', 'Suárez', 'Masculino', 2235362080, 'santy_9_91@hotmail.com', '1991-04-01', 'Avenida J.J. Paso', 3272, 'Mar del Plata', 'Buenos Aires');
INSERT INTO usuarios (dni, nombre, apellido, sexo, telefono_cel, email, fecha_nacimiento, calle_domicilio, altura_domicilio, localidad, provincia) VALUES (35621452, 'Pablo Martín', 'Spaltro', 'Masculino', 2235355455, 'PABLOS91@hotmail.com', '1991-04-04', 'Avenida J.B. Justo', 3072, 'Mar del Plata', 'Buenos Aires');

#Pacientes
INSERT INTO pacientes (usuarios_dni, planos1_id, idos1, fecha_internacion, estado, nombre_contacto, apellido_contacto, parentezco_contacto, telefono_contacto) VALUES (35621452, 1, 12345678910, '2020-08-15', 'Activo', 'Juan', 'Spaltro', 'Abuelo', 2234444444);
#INSERT INTO pacientes (usuarios_dni, usuarios_nombre, apellido, sexo, telefono_cel, email, fecha_nacimiento, calle_domicilio, altura_domicilio, localidad, provincia, planos1_id, idos1, fecha_internacion, estado, nombre_contacto, apellido_contacto, parentezco_contacto, telefono_contacto) VALUES (35621453, 'Ismael', 'Adduci', 'Masculino', 2235390200, 'franadu91@hotmail.com', '1991-08-10', 'Avenida Siempre Viva', 4040, 'Mar del Plata', 'Buenos Aires', 1, 12345678900, '2020-08-11', 'Activo', 'Juan', 'Adduci', 'Esposa', 2234224444);
#INSERT INTO pacientes (usuarios_dni, telefono_contacto) VALUES (35621451, 2234444444);

#Roles
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');
INSERT INTO `roles`(nombre) VALUES ('ROLE_USER');

INSERT INTO usuarios_roles (usuarios_dni, roles_id) VALUES (35621451,1);
INSERT INTO usuarios_roles (usuarios_dni, roles_id) VALUES (35621451,2);


