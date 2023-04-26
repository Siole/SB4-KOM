package dk.sdu.mmmi.cbse.collisionsystem;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.entityparts.PositionPart;
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
    void collisiontrue() {
        Entity entity1 = new Entity();
        Entity entity2 = new Entity();
        entity1.setRadius(10);
        entity2.setRadius(10);
        entity1.add(new PositionPart(10,10,10));
        entity2.add(new PositionPart(10,10,10));
        CollisionDetection collisionDetection = new CollisionDetection();
        boolean result = collisionDetection.collision(entity1, entity2);
        assertEquals(true, result);
    }

    @Test
    void collisionfalse() {
        Entity entity1 = new Entity();
        Entity entity2 = new Entity();
        entity1.setRadius(10);
        entity2.setRadius(10);
        entity1.add(new PositionPart(10,10,10));
        entity2.add(new PositionPart(100,100,10));
        CollisionDetection collisionDetection = new CollisionDetection();
        boolean result = collisionDetection.collision(entity1, entity2);
        assertEquals(false, result);
    }
}