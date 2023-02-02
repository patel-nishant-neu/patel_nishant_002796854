/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author nishn
 */
public class recipe {

   
    
    // Recipe
    private int recipeID;
    private String recipeTitle;
    private int recipeServ;
    private Boolean glutenFree;
    private double recipeDiffLev;
    private String recipeCategory;
    private String Description;
    private BufferedImage recipeImage;
    // Variable for Image

    
    public int getRecipeID() {
        return recipeID;
    }

    public void setRecipeID(int recipeID) {
        this.recipeID = recipeID;
    }

    public String getRecipeTitle() {
        return recipeTitle;
    }

    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }

    public int getRecipeServ() {
        return recipeServ;
    }

    public void setRecipeServ(int recipeServ) {
        this.recipeServ = recipeServ;
    }

    public Boolean getGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(Boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    public double getRecipeDiffLev() {
        return recipeDiffLev;
    }

    public void setRecipeDiffLev(double recipeDiffLev) {
        this.recipeDiffLev = recipeDiffLev;
    }

    public String getRecipeCategory() {
        return recipeCategory;
    }

    public void setRecipeCategory(String recipeCategory) {
        this.recipeCategory = recipeCategory;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public BufferedImage getRecipeImage() {
        return recipeImage;
    }

    public void setRecipeImage(BufferedImage recipeImage) {
        this.recipeImage = recipeImage;
    }
   

    
    //Array
    ArrayList<recipe> recipeList;
    private chef chef;

    public recipe() {
        this.chef = new chef();
        this.recipeList = new ArrayList<recipe>();
    }

    public ArrayList<recipe> getRecipeList() {
        return recipeList;
    }

    public void setProductList(ArrayList<recipe> recipeList) {
        this.recipeList = recipeList;
    }

    public chef getChef() {
        return chef;
    }

    public void setChef(chef chef) {
        this.chef = chef;
    }

    public recipe createRecipe(int RId, String recipeTitle, int recipeServ, Boolean glutenFree, double recipeDiffLev, String recipeCategory, String Description) {
        recipe recipeNew = new recipe();

        recipeNew.setRecipeID(RId);
        recipeNew.setRecipeTitle(recipeTitle);
        recipeNew.setRecipeServ(recipeServ);
        recipeNew.setGlutenFree(glutenFree);
        recipeNew.setRecipeDiffLev(recipeDiffLev);
        recipeNew.setRecipeCategory(recipeCategory);
        recipeNew.setDescription(Description);
        //recipeNew.setGlutenFree(glutenFree);
        
        this.recipeList.add(recipeNew);

        return recipeNew;
    }
    
    //Find recipe
    public recipe findRecipe(int RId) {
        for (recipe reci : this.recipeList) {
            if (reci.getRecipeID() == RId) {
                return reci;
            }
        }
        return null;
    }
    
}
