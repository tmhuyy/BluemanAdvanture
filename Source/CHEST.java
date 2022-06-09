public class CHEST extends Entity {
    public CHEST(GamePanel gp) {
        super(gp);
        name = "Chest";
        right1 = setup("OBJ_CHEST", gp.tileSize, gp.tileSize);
        collision = true;
        solidArea.x = 0;
        solidArea.y = 16;
        solidArea.width = 48;
        solidArea.height = 30;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }
}