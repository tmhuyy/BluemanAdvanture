public class AssetSetter{
    GamePanel gp;
    public AssetSetter(GamePanel gp){
        this.gp = gp;
    }
    public void setobject(){
        int mapNum = 1;
        int i = 0;
        gp.obj[mapNum][i] = new OBJ_DOOR(gp);
        gp.obj[mapNum][i].worldX = 41 * gp.tileSize;
        gp.obj[mapNum][i].worldY = 19 * gp.tileSize;
        i++;

        gp.obj[mapNum][i] = new OBJ_DOOR(gp);
        gp.obj[mapNum][i].worldX = 28 * gp.tileSize;
        gp.obj[mapNum][i].worldY = 13 * gp.tileSize;
        i++;

        gp.obj[mapNum][i] = new OBJ_DOOR(gp);
        gp.obj[mapNum][i].worldX = 20 * gp.tileSize;
        gp.obj[mapNum][i].worldY = 8 * gp.tileSize;
        i++;

        gp.obj[mapNum][i] = new OBJ_DOOR(gp);
        gp.obj[mapNum][i].worldX = 20 * gp.tileSize;
        gp.obj[mapNum][i].worldY = 14 * gp.tileSize;
        i++;

        gp.obj[mapNum][i] = new OBJ_DOOR(gp);
        gp.obj[mapNum][i].worldX = 20 * gp.tileSize;
        gp.obj[mapNum][i].worldY = 14 * gp.tileSize;
        i++;

        mapNum = 0;
        gp.obj[mapNum][i] = new OBJ_DOOR(gp);
        gp.obj[mapNum][i].worldX = 16 * gp.tileSize;
        gp.obj[mapNum][i].worldY = 15 * gp.tileSize;
        i++;

        gp.obj[mapNum][i] = new OBJ_DOOR(gp);
        gp.obj[mapNum][i].worldX = 11 * gp.tileSize;
        gp.obj[mapNum][i].worldY = 28 * gp.tileSize;
        i++;

        gp.obj[mapNum][i] = new OBJ_DOOR(gp);
        gp.obj[mapNum][i].worldX = 22 * gp.tileSize;
        gp.obj[mapNum][i].worldY = 37 * gp.tileSize;
        i++;

        gp.obj[mapNum][i] = new OBJ_DOOR(gp);
        gp.obj[mapNum][i].worldX = 35 * gp.tileSize;
        gp.obj[mapNum][i].worldY = 15 * gp.tileSize;
        i++;

        gp.obj[mapNum][i] = new OBJ_DOOR(gp);
        gp.obj[mapNum][i].worldX = 42 * gp.tileSize;
        gp.obj[mapNum][i].worldY = 28 * gp.tileSize;
        i++;

        // gp.obj[mapNum][i] = new OBJ_DOOR(gp);
        // gp.obj[mapNum][i].worldX = 13 * gp.tileSize;
        // gp.obj[mapNum][i].worldY = 31 * gp.tileSize;
        // i++;

        // gp.obj[mapNum][i] = new OBJ_DOOR(gp);
        // gp.obj[mapNum][i].worldX = 17 * gp.tileSize;
        // gp.obj[mapNum][i].worldY = 32 * gp.tileSize;
        // i++;
    }

    public void setNPC(){
        int mapNum = 1;
        int i = 0;
        gp.npc[mapNum][i] = new NPC_OLDMAN(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 15;
        gp.npc[mapNum][i].worldY = gp.tileSize * 15;
        i++;
        
        gp.npc[mapNum][i] = new NPC_OLDMAN(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 26;
        gp.npc[mapNum][i].worldY = gp.tileSize * 14;
        i++;
        
        gp.npc[mapNum][i] = new NPC_OLDMAN(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 31;
        gp.npc[mapNum][i].worldY = gp.tileSize * 38;
        i++;

        gp.npc[mapNum][i] = new NPC_OLDMAN(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 24;
        gp.npc[mapNum][i].worldY = gp.tileSize * 28;
        i++;

        gp.npc[mapNum][i] = new NPC_OLDMAN(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 44;
        gp.npc[mapNum][i].worldY = gp.tileSize * 19;
        i++;

        mapNum = 0;
        gp.npc[mapNum][i] = new NPC_OLDMAN(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 12;
        gp.npc[mapNum][i].worldY = gp.tileSize * 9;
        i++;

        gp.npc[mapNum][i] = new NPC_OLDMAN(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 40;
        gp.npc[mapNum][i].worldY = gp.tileSize * 9;
        i++;

        gp.npc[mapNum][i] = new NPC_OLDMAN(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 17;
        gp.npc[mapNum][i].worldY = gp.tileSize * 17;
        i++;

        gp.npc[mapNum][i] = new NPC_OLDMAN(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 12;
        gp.npc[mapNum][i].worldY = gp.tileSize * 36;
        i++;

        gp.npc[mapNum][i] = new NPC_OLDMAN(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 32;
        gp.npc[mapNum][i].worldY = gp.tileSize * 35;
        i++;

        gp.npc[mapNum][i] = new NPC_OLDMAN(gp);
        gp.npc[mapNum][i].worldX = gp.tileSize * 32;
        gp.npc[mapNum][i].worldY = gp.tileSize * 35;
        i++;
    }

    public void setMonster(){
        int mapNum = 1;
        int i = 0;
        gp.monster[mapNum][i] = new MON(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 34;
        gp.monster[mapNum][i].worldY = gp.tileSize * 13;
        i++;

        gp.monster[mapNum][i] = new MON(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 10;
        gp.monster[mapNum][i].worldY = gp.tileSize * 16;
        i++;

        gp.monster[mapNum][i] = new MON(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 44;
        gp.monster[mapNum][i].worldY = gp.tileSize * 30;
        i++;

        gp.monster[mapNum][i] = new MON(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 11;
        gp.monster[mapNum][i].worldY = gp.tileSize * 39;
        i++;

        mapNum = 0;
        gp.monster[mapNum][i] = new MON2(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 19;
        gp.monster[mapNum][i].worldY = gp.tileSize * 16;
        i++;

        gp.monster[mapNum][i] = new MON2(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 10;
        gp.monster[mapNum][i].worldY = gp.tileSize * 24;
        i++;

        gp.monster[mapNum][i] = new MON2(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 32;
        gp.monster[mapNum][i].worldY = gp.tileSize * 16;
        i++;

        gp.monster[mapNum][i] = new MON2(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 42;
        gp.monster[mapNum][i].worldY = gp.tileSize * 24;
        i++;

        gp.monster[mapNum][i] = new MON2(gp);
        gp.monster[mapNum][i].worldX = gp.tileSize * 43;
        gp.monster[mapNum][i].worldY = gp.tileSize * 25;
        i++;
    }
}