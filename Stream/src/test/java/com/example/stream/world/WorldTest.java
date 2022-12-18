package com.example.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WorldTest {
    @Test
    void testGetPeopleQuantity() {
        //Given
        Continent europa = new Continent("Europa");
        Country england = new Country("England", BigDecimal.valueOf(2000000L));
        Country poland = new Country("Poland", BigDecimal.valueOf(3000000L));
        Country germany = new Country("Germany", BigDecimal.valueOf(4000000L));
        europa.addCountry(england);
        europa.addCountry(poland);
        europa.addCountry(germany);

        Continent asia = new Continent("Asia");
        Country china = new Country("China", BigDecimal.valueOf(1000000L));
        Country russia = new Country("Russia", BigDecimal.valueOf(4010000L));
        Country japan = new Country("Japan", BigDecimal.valueOf(4020000L));
        asia.addCountry(china);
        asia.addCountry(russia);
        asia.addCountry(japan);

        Continent america = new Continent("America");
        Country brazil = new Country("Brazil", BigDecimal.valueOf(4100000L));
        Country costarica = new Country("Costarica", BigDecimal.valueOf(4100000L));
        Country argentina = new Country("Argentina", BigDecimal.valueOf(4100000L));
        america.addCountry(brazil);
        america.addCountry(costarica);
        america.addCountry(argentina);

        World world = new World();
        world.addContinents(america);
        world.addContinents(asia);
        world.addContinents(europa);

        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();
        System.out.println(peopleQuantity);

        //Then
        assertEquals(peopleQuantity, new BigDecimal(30330000));
    }

}