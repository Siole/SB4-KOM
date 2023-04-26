package dk.sdu.mmmi.cbse.collisionsystem;

import dk.sdu.mmmi.cbse.common.data.Entity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollisionDetectionTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void collision() {
        Entity entity1 = new Entity();
        Entity entity2 = new Entity();
        entity1.setRadius(10);
        entity2.setRadius(10);
        CollisionDetection collisionDetection = new CollisionDetection();
        boolean result = collisionDetection.collision(entity1, entity2);
        assertEquals(false, result);
    }
}