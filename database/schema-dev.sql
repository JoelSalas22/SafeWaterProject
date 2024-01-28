DROP TABLE IF EXISTS Sensor, Parameter, SensorData;
START TRANSACTION;
CREATE TABLE IF NOT EXISTS Sensor (
id SERIAL PRIMARY KEY,
name text NOT NULL,
active BOOLEAN NOT NULL,
description text NOT NULL
);

CREATE TABLE IF NOT EXISTS Parameter (
id SERIAL PRIMARY KEY,
name text NOT NULL
);

CREATE TABLE IF NOT EXISTS SensorData (
id SERIAL PRIMARY KEY,
fk_sensor_id INTEGER NOT NULL,
fk_parameter_id INTEGER NOT NULL,
year text NOT NULL,
month text NOT NULL,
value text NOT NULL,
CONSTRAINT fk_sensor_id FOREIGN KEY (fk_sensor_id) REFERENCES Sensor(id),
CONSTRAINT fk_parameter_id FOREIGN KEY (fk_parameter_id) REFERENCES Parameter(id)
);

END TRANSACTION;
