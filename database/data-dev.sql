SELECT * FROM Sensor;
SELECT * FROM Parameter;
SELECT * FROM SensorData;

START TRANSACTION;

INSERT INTO Sensor (name, active, description) VALUES
    ('SNS-001', True, 'Cleveland, OH'),
    ('SNS-002', True, 'Cuyahoga River, Cleveland, OH'),
    ('SNS-003', True, 'Sandusky, OH');

INSERT INTO Parameter (name) VALUES
('Copper'),
('pH'),
('Iron');

INSERT INTO SensorData (fk_sensor_id, fk_parameter_id, year, month, value) VALUES
(1, '2024', 'Januaray', '0.546');


DELETE FROM public.parameterwhere id = 2;