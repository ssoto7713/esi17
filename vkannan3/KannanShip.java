package esi17.vkannan3;
import battleship.core.*;
import java.util.List;

/*
 * KannanShip
 * @author Vinesh Kannan
 */
public class KannanShip extends Ship {
    
    public KannanShip() {
        this.initializeName("Kannan Ship");
        this.initializeOwner("Vinesh Kannan");
        this.initializeHull(3);
        this.initializeFirepower(2);
        this.initializeSpeed(2);
        this.initializeRange(4);
    }
    
    /*
     * Determines what actions the ship will take on a given turn
     * @param arena (Arena) the battlefield for the match
     * @return void
     */
    @Override
    public void doTurn(Arena arena) {
        
        this.move(arena,Direction.WEST);
        this.move(arena,Direction.NORTH);
        this.move(arena,Direction.EAST);
        this.move(arena,Direction.SOUTH);
        
        Coord location = this.getCoord();
        if (location.getX() != 0) {
            this.move(arena, Direction.WEST);
        } else if (location.getY() != 0) {
            this.move(arena, Direction.NORTH);
        System.out.println(" ");
        List<Ship> ships = arena.getAllShips();
        for (Ship ship : ships) {
            Coord coord = this.getCoord();
            System.out.println(ship + ": " + coord);
        }
        }
        this.move(arena, Direction.EAST);
    }
    
}