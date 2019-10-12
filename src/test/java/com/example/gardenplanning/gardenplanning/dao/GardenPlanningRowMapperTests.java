package com.example.gardenplanning.gardenplanning.dao;

import com.example.gardenplanning.dao.PlantRowMapper;
import com.example.gardenplanning.model.Plant;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class
GardenPlanningRowMapperTests {

    @Test
    public void mapTheGarden() throws SQLException {

        /* This is some code that simulates what happens when Java runs
        SQL code using JDBC. It's meant to simulate a database call
        that produces this:

        ID   PLANTNAME   STARTSEEDLINGSINDOOR   SOWSEEDSDIRECTLY   TRANSPLANTINDOORSEEDLINGS   GROWINGPERIOD   HARVESTPERIOD
        3    PlantName
         */
        ResultSet rs = mock(ResultSet.class);
        when(rs.getInt("id")).thenReturn(47);
        when(rs.getString("plantName")).thenReturn("PlantName");
        when(rs.getString("startSeedlingsIndoor")).thenReturn("StartSeedlingsIndoor");
        when(rs.getString("sowSeedsDirectly")).thenReturn("SowSeedsDirectly");
        when(rs.getString("transplantIndoorSeedlings")).thenReturn("TransplantIndoorSeedlings");
        when(rs.getString("growingPeriod")).thenReturn("GrowingPeriod");
        when(rs.getString("harvestPeriod")).thenReturn("HarvestPeriod");
        when(rs.getString("plantNotes")).thenReturn("PlantNotes");

        //This is the call to the Row Mapper
        Plant mapped = new PlantRowMapper().mapRow(rs,0);

        //Here, we check the result to see if it worked!
        Assert.assertEquals(47, mapped.getId());
        Assert.assertEquals("PlantName", mapped.getPlantName());
        Assert.assertEquals("StartSeedlingsIndoor", mapped.getStartSeedlingsIndoor());
        Assert.assertEquals("SowSeedsDirectly", mapped.getSowSeedsDirectly());
        Assert.assertEquals("TransplantIndoorSeedlings", mapped.getTransplantIndoorSeedlings());
        Assert.assertEquals("GrowingPeriod", mapped.getGrowingPeriod());
        Assert.assertEquals("HarvestPeriod", mapped.getHarvestPeriod());
        Assert.assertEquals("PlantNotes",  mapped.getPlantNotes());
    }


}
