package com.emse.spring.faircorp.api;

import com.emse.spring.faircorp.dao.BuildingDao;
import com.emse.spring.faircorp.dao.HeaterDao;
import com.emse.spring.faircorp.dao.RoomDao;
import com.emse.spring.faircorp.dao.WindowDao;
import com.emse.spring.faircorp.dto.BuildingDto;
import com.emse.spring.faircorp.model.Building;
import com.emse.spring.faircorp.model.Room;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Transactional
@RestController
@RequestMapping("api/building")
public class BuildingController {

    private final BuildingDao buildingDao;
    private final RoomDao roomDao;
    private final HeaterDao heaterDao;
    private final WindowDao windowDao;

    public BuildingController(BuildingDao buildingDao, RoomDao roomDao, HeaterDao heaterDao, WindowDao windowDao) {
        this.buildingDao = buildingDao;
        this.roomDao = roomDao;
        this.heaterDao = heaterDao;
        this.windowDao = windowDao;
    }

    @GetMapping
    public List<BuildingDto> findAll() {
        return buildingDao.findAll().stream().map(BuildingDto::new).collect(Collectors.toList());
    }

    @GetMapping(path = "/{id}")
    public BuildingDto findById(@PathVariable Long id) {
        return buildingDao.findById(id).map(BuildingDto::new).orElse(null);
    }

    @PostMapping
    public BuildingDto create(@RequestBody BuildingDto dto) {
        Building building = null;
        // On creation id is not defined
        if (dto.getId() == null) {
            building = buildingDao.save(new Building(dto.getRoomList(), dto.getOutsideTemperature(), dto.getName()));
        } else {
            building = buildingDao.getById(dto.getId());
        }
        return new BuildingDto(building);
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable Long id) {
        long roomId;
        for (Room room : buildingDao.getById(id).getRoomList()) {
            roomId = room.getId();
            heaterDao.deleteByRoom(roomId);
            windowDao.deleteByRoom(roomId);
            roomDao.deleteById(roomId);
            buildingDao.deleteById(id);
        }
    }

}
