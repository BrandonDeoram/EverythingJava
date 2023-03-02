# Untitled

# World Creation

## Ground

1. Use one of these websites to find a tile map to your liking , it must be copyright free .
    1. For this project we will be using this tilemap : [https://opengameart.org/content/6-color-dungeon-16x16](https://opengameart.org/content/6-color-dungeon-16x16)
    2. To search for more tilemaps you can go to this site : [https://opengameart.org/](https://opengameart.org/)
2. Once you’ve downloaded file create a new folder in Assets named : Tile

![Untitled](Untitled%2025041855806b415b9285cf7cab34d8f8/Untitled.png)

1. Then drag the file into the Tiles folder 
2. Within the Tiles Folder create another Folder called Tile Palletes
3. Now click on the file that you downloaded and you should see the inspector tab show to the right like this:
    
    ![Untitled](Untitled%2025041855806b415b9285cf7cab34d8f8/Untitled%201.png)
    
4. Change the following options:
    1. Sprite Mode → Multiple 
    2. Pixels Per Unit → 16
    3. Filter Mode → Point (no filter ) 
        
        
5. Hit the apply button , then hit the sprite editor button 
    
    ![Untitled](Untitled%2025041855806b415b9285cf7cab34d8f8/Untitled%202.png)
    
6. Click on the Slice option 
    
    ![Untitled](Untitled%2025041855806b415b9285cf7cab34d8f8/Untitled%203.png)
    
7. Change the following setting: 
    1. Type → Grid By Cell Size (X: 16 , Y:16)
8. Hit the slice button , then the applly button 
    
    ![Untitled](Untitled%2025041855806b415b9285cf7cab34d8f8/Untitled%204.png)
    

1. Back to the main screen, Go to Tile Pallete which is next to the inspector and create a new pallete name it DungeonTileSet
    
    ![Untitled](Untitled%2025041855806b415b9285cf7cab34d8f8/Untitled%205.png)
    
2. Window should pop up , select the folder of the Tile Pallete we named earlier 
    1. File structure should look like this : Assets→ Tiles→ Tile Palletes
3. Right click after you’re main and click on Create Empty → Call it World 
4. Right click on world → 2D Object→ TileMap→ Rectangular , name it Ground
    
    ![Untitled](Untitled%2025041855806b415b9285cf7cab34d8f8/Untitled%206.png)
    
5. Click on ground and go to Tile Palette , change Active TileMap to Ground so that whatever you draw on the screen is only being drawn on the OBJECT ground 
6. Drag the file into the Tile Palette 
    
    ![Untitled](Untitled%2025041855806b415b9285cf7cab34d8f8/Untitled%207.png)
    
    1. A new window should appear , select Tile Palettes folder
    2. Select the brush icon at the top like so and start drawing , you can use these keys “[” or “]” to rotate the tile 
        
        ![Untitled](Untitled%2025041855806b415b9285cf7cab34d8f8/Untitled%208.png)
        
        ![Untitled](Untitled%2025041855806b415b9285cf7cab34d8f8/Untitled%209.png)
        
    3.  We need to be able to interact with the ground so add these settings click on Inspector and add these components:
        1. TileMap Collider 2D 
        2. Rigidbody 2D: We need to change Body Type → Static because these objects shouldn't be moving 
        3. Composite Collider 2D
        4. Platform Effector 2D
    
    ---
    
    ## Spikes
    
    1. Right click on Platforms create a tile map called Spikes
    2. You can then click on the spikes in tile palette and place them on the screen wherever you’d like
    3. With that being said we want the spikes to appear above the ground so change the layer to 1 so it appear over ground which is 0 

![Untitled](Untitled%2025041855806b415b9285cf7cab34d8f8/Untitled%2010.png)

1. We then create a tag called Spikes so it can physically affect player 
2. Add these components to Spikes 
    
    ![Untitled](Untitled%2025041855806b415b9285cf7cab34d8f8/Untitled%2011.png)
    

---

# Objects

1. For rocks, flags, signs preform the same steps by using the brush tools to draw your objects , just dont add any components 

---

#