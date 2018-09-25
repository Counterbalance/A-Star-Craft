package com.codingame.game;

import java.util.HashSet;
import java.util.Set;

public class Robot {
    private static int globalId = 0;

    private static class State {
        private Cell cell;
        private int direction;

        public State(Cell cell, int direction) {
            super();
            this.cell = cell;
            this.direction = direction;
        }

        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((cell == null) ? 0 : cell.hashCode());
            result = prime * result + direction;
            return result;
        }

        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            State other = (State) obj;
            if (cell == null) {
                if (other.cell != null)
                    return false;
            } else if (!cell.equals(other.cell))
                return false;
            if (direction != other.direction)
                return false;
            return true;
        }
    }

    protected int id;
    protected Cell cell;
    protected int direction;
    protected Set<State> states;
    protected int death;

    public Robot() {
        id = globalId++;
        states = new HashSet<>();
    }

    public boolean registerState() {
        return states.add(new State(cell, direction));
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Robot other = (Robot) obj;
        if (id != other.id)
            return false;
        return true;
    }

}
