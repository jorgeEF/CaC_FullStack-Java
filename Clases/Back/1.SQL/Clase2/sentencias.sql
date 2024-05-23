USE cac_java;
-- ver empleados
SELECT * FROM empleados;

-- ver empleado específico
SELECT * FROM empleados
WHERE id = 1;

-- agregar empleado
INSERT INTO empleados(nombre,puesto,salario,fecha_contratacion,email)
VALUES ('Pepe','Limpieza','500000','2024-05-23','pepe@gmail.com');

-- eliminar empleado
DELETE FROM empleados
WHERE id = 1;

-- actualizar datos de empleado
UPDATE empleados
SET nombre = 'pepe'
WHERE id = 1;

-- funciones
count: sirve para contar cantidad de filas, ej:
SELECT count(*) as total_empleados FROM empleados;

sum: suma valores segun condiciones dadas, ej:
SELECT sum(salario) as total_salarios FROM empleados;

avg: obtiene el promedio de un valor, ej:
SELECT avg(salario) as salario_promedio FROM empleados;

MIN y MAX: obtiene los valores minimos y/o maximos de un campo indicado.