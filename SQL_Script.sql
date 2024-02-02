CREATE TABLE Viviendas (
    IdVivienda VARCHAR(255) PRIMARY KEY,
    Ubicacion VARCHAR(255),
    MetrosCuadrados DOUBLE,
    NumHabitaciones INT,
    NumBanos INT,
    CodigoReferencia VARCHAR(255),
    PrecioAlquilerMensual DOUBLE
);

CREATE TABLE Alquileres (
    NumeroExpediente INT PRIMARY KEY,
    FechaEntrada DATE,
    TiempoEstimadoAlquiler INT,
    NombreCliente VARCHAR(255),
    DatosPersonalesCliente TEXT,
    DatosFacturacionCliente TEXT,
    IdVivienda VARCHAR(255),
    FOREIGN KEY (IdVivienda) REFERENCES Viviendas(IdVivienda)
);

-- Insertar datos en la tabla Viviendas
INSERT INTO Viviendas (IdVivienda, Ubicacion, MetrosCuadrados, NumHabitaciones, NumBanos, CodigoReferencia, PrecioAlquilerMensual)
VALUES
    ('1', 'Calle A 123', 80.5, 2, 1, 'ABC123', 800),
    ('2', 'Avenida B 456', 120.0, 3, 2, 'XYZ789', 1200),
    ('3', 'Calle C 789', 60.0, 1, 1, 'DEF456', 600);

-- Insertar datos en la tabla Alquileres
INSERT INTO Alquileres (NumeroExpediente, FechaEntrada, TiempoEstimadoAlquiler, NombreCliente, DatosPersonalesCliente, DatosFacturacionCliente, IdVivienda)
VALUES
    (1, '2023-01-01', 30, 'Juan Pérez', 'C/ Ejemplo 456', '1234-5678-9012-3456', '1'),
    (2, '2023-02-15', 45, 'María Gómez', 'Av. Ejemplo 789', '5678-9012-3456-7890', '2'),
    (3, '2023-03-10', 60, 'Carlos Rodríguez', 'C/ Otra 123', '9876-5432-1098-7654', '3');

-- Insertar datos en la tabla Viviendas
INSERT INTO Viviendas (IdVivienda, Ubicacion, MetrosCuadrados, NumHabitaciones, NumBanos, CodigoReferencia, PrecioAlquilerMensual)
VALUES
    ('4', 'Avenida D 012', 90.5, 2, 2, 'GHI789', 950),
    ('5', 'Calle E 345', 100.0, 3, 2, 'JKL012', 1100),
    ('6', 'Avenida F 678', 75.0, 1, 1, 'MNO345', 700);

-- Insertar datos en la tabla Alquileres
INSERT INTO Alquileres (NumeroExpediente, FechaEntrada, TiempoEstimadoAlquiler, NombreCliente, DatosPersonalesCliente, DatosFacturacionCliente, IdVivienda)
VALUES
    (4, '2023-04-05', 30, 'Laura Martínez', 'C/ Nueva 789', '5432-1098-7654-3210', '4'),
    (5, '2023-05-20', 45, 'Javier López', 'Av. Nueva 012', '2109-8765-4321-0987', '5'),
    (6, '2023-06-15', 60, 'Ana Fernández', 'C/ Otra Nueva 456', '8765-4321-0987-6543', '6');

