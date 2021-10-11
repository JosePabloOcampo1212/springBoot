DROP TABLE vet_specialties IF EXISTS;
DROP TABLE vets IF EXISTS;
DROP TABLE specialties IF EXISTS;
DROP TABLE visits IF EXISTS;
DROP TABLE pets IF EXISTS;
DROP TABLE types IF EXISTS;
DROP TABLE owners IF EXISTS;


CREATE TABLE vets (
  id         INTEGER IDENTITY PRIMARY KEY,
  first_name VARCHAR(30),
  last_name  VARCHAR(30)
);
CREATE INDEX vets_last_name ON vets (last_name);

CREATE TABLE specialties (
  id   INTEGER IDENTITY PRIMARY KEY,
  name VARCHAR(80)
);
CREATE INDEX specialties_name ON specialties (name);

CREATE TABLE vet_specialties (
  vet_id       INTEGER NOT NULL,
  specialty_id INTEGER NOT NULL
);

ALTER TABLE vet_specialties ADD CONSTRAINT fk_vet_specialties_vets FOREIGN KEY (vet_id) REFERENCES vets (id);
ALTER TABLE vet_specialties ADD CONSTRAINT fk_vet_specialties_specialties FOREIGN KEY (specialty_id) REFERENCES specialties (id);

CREATE TABLE types (
  id   INTEGER IDENTITY PRIMARY KEY,
  name VARCHAR(80)
);
CREATE INDEX types_name ON types (name);

CREATE TABLE owners (
  id         INTEGER IDENTITY PRIMARY KEY,
  first_name VARCHAR(30),
  last_name  VARCHAR_IGNORECASE(30),
  address    VARCHAR(255),
  city       VARCHAR(80),
  telephone  VARCHAR(20)
);
CREATE INDEX owners_last_name ON owners (last_name);

CREATE TABLE pets (
  id         INTEGER IDENTITY PRIMARY KEY,
  name       VARCHAR(30),
  birth_date DATE,
  type_id    INTEGER NOT NULL,
  owner_id   INTEGER NOT NULL
);
ALTER TABLE pets ADD CONSTRAINT fk_pets_owners FOREIGN KEY (owner_id) REFERENCES owners (id);
ALTER TABLE pets ADD CONSTRAINT fk_pets_types FOREIGN KEY (type_id) REFERENCES types (id);
CREATE INDEX pets_name ON pets (name);

CREATE TABLE visits (
  id          INTEGER IDENTITY PRIMARY KEY,
  pet_id      INTEGER NOT NULL,
  visit_date  DATE,
  description VARCHAR(255)
);
ALTER TABLE visits ADD CONSTRAINT fk_visits_pets FOREIGN KEY (pet_id) REFERENCES pets (id);
CREATE INDEX visits_pet_id ON visits (pet_id);



CREATE TABLE hospital (
  id          INTEGER IDENTITY PRIMARY KEY
);


CREATE TABLE tienda (
  id          INTEGER IDENTITY PRIMARY KEY,
  hospital_id INTEGER NOT NULL
);
ALTER TABLE tienda ADD CONSTRAINT fk_tienda_hospital FOREIGN KEY (hospital_id) REFERENCES hospital (id);



CREATE TABLE veterinario (
  id          INTEGER IDENTITY PRIMARY KEY,
  hospital_id      INTEGER NOT NULL,
  nombre VARCHAR(255),
  apellido1 VARCHAR(255),
  apellido2 VARCHAR(255),
  direccion VARCHAR(255),
  telefono VARCHAR(255)
);
ALTER TABLE veterinario ADD CONSTRAINT fk_veterinario_hospital FOREIGN KEY (hospital_id) REFERENCES hospital (id);


CREATE TABLE especialidad (
  id          INTEGER IDENTITY PRIMARY KEY,
  nombre VARCHAR(255)
);

CREATE TABLE veterinario_especialidad (
  veterinario_id       INTEGER NOT NULL,
  especialidad_id INTEGER NOT NULL
);
ALTER TABLE veterinario_especialidad ADD CONSTRAINT fk_veterinario_especialidad_vets FOREIGN KEY (veterinario_id) REFERENCES veterinario (id);
ALTER TABLE veterinario_especialidad ADD CONSTRAINT fk_veterinario_especialidad_especialidad FOREIGN KEY (especialidad_id) REFERENCES especialidad (id);



CREATE TABLE horario (
  id          INTEGER IDENTITY PRIMARY KEY,
  veterinario_id INTEGER NOT NULL,
  hora_inicio VARCHAR(255),
  hora_fin VARCHAR(255),
  dias_laborales VARCHAR(255)
);
ALTER TABLE horario ADD CONSTRAINT fk_horario_veterinario FOREIGN KEY (veterinario_id) REFERENCES veterinario (id);


CREATE TABLE cliente (
  id          INTEGER IDENTITY PRIMARY KEY,
  hospital_id      INTEGER NOT NULL,
  nombre VARCHAR(255),
  apellido1 VARCHAR(255),
  apellido2 VARCHAR(255),
  direccion VARCHAR(255),
  telefono VARCHAR(255)
);
ALTER TABLE cliente ADD CONSTRAINT fk_cliente_hospital FOREIGN KEY (hospital_id) REFERENCES hospital (id);



CREATE TABLE mascota (
  id          INTEGER IDENTITY PRIMARY KEY,
  cliente_id  INTEGER NOT NULL,
  nombre VARCHAR(255),
  tipo VARCHAR(255),
  fecha_de_nacimiento DATE
);
ALTER TABLE mascota ADD CONSTRAINT fk_mascota_cliente FOREIGN KEY (cliente_id) REFERENCES cliente (id);



CREATE TABLE expediente (
  id          INTEGER IDENTITY PRIMARY KEY,
  mascota_id  INTEGER NOT NULL
);
ALTER TABLE expediente ADD CONSTRAINT fk_expediente_cliente FOREIGN KEY (mascota_id) REFERENCES mascota (id);

CREATE TABLE factura_hospital (
  id          INTEGER IDENTITY PRIMARY KEY,
  cliente_id  INTEGER NOT NULL,
  fecha DATE
);
ALTER TABLE factura_hospital ADD CONSTRAINT fk_factura_hospital_cliente FOREIGN KEY (cliente_id) REFERENCES cliente (id);

CREATE TABLE servicio (
  id          INTEGER IDENTITY PRIMARY KEY,
  fecha DATE,
  descripcion VARCHAR(255),
  veterinario_id INTEGER NOT NULL,
  expediente_id INTEGER NOT NULL,
  factura_hospital_id INTEGER NOT NULL
);
ALTER TABLE servicio ADD CONSTRAINT fk_servicio_veterinario FOREIGN KEY (veterinario_id) REFERENCES veterinario (id);
ALTER TABLE servicio ADD CONSTRAINT fk_servicio_expediente FOREIGN KEY (expediente_id) REFERENCES expediente (id);
ALTER TABLE servicio ADD CONSTRAINT fk_servicio_factura_hospital FOREIGN KEY (factura_hospital_id) REFERENCES factura_hospital (id);

CREATE TABLE factura_tienda (
  id          INTEGER IDENTITY PRIMARY KEY,
  cliente_id  INTEGER NOT NULL,
  fecha DATE
);
ALTER TABLE factura_tienda ADD CONSTRAINT fk_factura_tienda_cliente FOREIGN KEY (cliente_id) REFERENCES cliente (id);

CREATE TABLE producto (
  id          INTEGER IDENTITY PRIMARY KEY,
  tienda_id  INTEGER NOT NULL,
  nombre VARCHAR(255),
  descripcion VARCHAR(255),
  cantidad_en_existencia INTEGER
);
ALTER TABLE producto ADD CONSTRAINT fk_tienda_producto FOREIGN KEY (tienda_id) REFERENCES tienda (id);

CREATE TABLE producto_comprado (
  id          INTEGER IDENTITY PRIMARY KEY,
  producto_id INTEGER NOT NULL,
  servicio_id INTEGER,
  factura_tienda_id INTEGER,
  expediente_id INTEGER,
  fecha DATE,
  cantidad INTEGER
);
ALTER TABLE producto_comprado ADD CONSTRAINT fk_producto_comprado_producto FOREIGN KEY (producto_id) REFERENCES producto (id);
ALTER TABLE producto_comprado ADD CONSTRAINT fk_producto_comprado_servicio FOREIGN KEY (servicio_id) REFERENCES servicio (id);
ALTER TABLE producto_comprado ADD CONSTRAINT fk_producto_comprado_factura_tienda FOREIGN KEY (factura_tienda_id) REFERENCES factura_tienda (id);
ALTER TABLE producto_comprado ADD CONSTRAINT fk_producto_comprado_expediente FOREIGN KEY (expediente_id) REFERENCES expediente (id);

