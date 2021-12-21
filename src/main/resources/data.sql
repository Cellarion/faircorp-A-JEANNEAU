INSERT INTO BUILDING(id, outside_temperature, name)
VALUES (2, 2.1, 'The One');

INSERT INTO BUILDING(id, outside_temperature, name)
VALUES (3, 22, 'The Second');

INSERT INTO ROOM(id, name, floor, current_temperature, target_temperature, building_id)
VALUES (-13, 'Room Second', 3, 26.0, 26.3, 3);
INSERT INTO ROOM(id, name, floor, building_id)
VALUES (-4, 'Room2', 1, 2);
INSERT INTO ROOM(id, name, floor, current_temperature, target_temperature, building_id)
VALUES (-10, 'Room1', 1, 22.3, 20.0, 2);

INSERT INTO HEATER(id, heater_status, name, power, room_id)
VALUES (-10, 'ON', 'Heater1', 2000, -10);
INSERT INTO HEATER(id, heater_status, name, power, room_id)
VALUES (-5, 'ON', 'Heater2', null, -10);
INSERT INTO HEATER(id, heater_status, name, power, room_id)
VALUES (-9, 'OFF', 'Heater2', 6000, -13);

INSERT INTO RWINDOW(id, window_status, name, room_id)
VALUES (-10, 'CLOSED', 'Window 1', -10);
INSERT INTO RWINDOW(id, window_status, name, room_id)
VALUES (-9, 'CLOSED', 'Window 2', -10);
INSERT INTO RWINDOW(id, window_status, name, room_id)
VALUES (-8, 'OPEN', 'Window 10', -4);
INSERT INTO RWINDOW(id, window_status, name, room_id)
VALUES (-7, 'CLOSED', 'Window 11', -4);

INSERT INTO RWINDOW(id, window_status, name, room_id)
VALUES (-6, 'CLOSED', 'Window Second', -13);
