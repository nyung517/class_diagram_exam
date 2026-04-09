class Potion {

}

class Weapon {

}

class Monster {
    void kill() {

    }
}

class Character {
    Potion potion;
    Weapon weapon;

    public Character() { }

    void getWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void kill(Monster monster) {
        monster.kill();
    }
}
