package me.schntgaispock.myfirstaddon.slimefun;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import lombok.Getter;
import lombok.NonNull;

public class SchnsRecipes {
    /**
     * Recipe
     */
    public static class Recipe {
        @Getter
        public final RecipeType recipeType;
        @Getter
        public final ItemStack[] recipe;

        public Recipe(@NonNull RecipeType recipeType, @NonNull ItemStack[] recipe) {
            this.recipeType = recipeType;
            this.recipe = recipe;
        }
    }

    public static final Recipe FIRE_CAKE;
    public static final Recipe WATER_CAKE;
    public static final Recipe XP_PRINTER;

    static {
        FIRE_CAKE = new Recipe(
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                null, null, null,
                null, new ItemStack(Material.CANDLE), null,
                null, new ItemStack(Material.CAKE), null
            });

        WATER_CAKE = new Recipe(
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                null, null, null,
                null, new ItemStack(Material.WATER_BUCKET), null,
                null, new ItemStack(Material.CAKE), null
            });

        XP_PRINTER = new Recipe(
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(Material.EXPERIENCE_BOTTLE), new ItemStack(Material.EXPERIENCE_BOTTLE),
                new ItemStack(Material.EXPERIENCE_BOTTLE),
                new ItemStack(Material.EXPERIENCE_BOTTLE), new ItemStack(Material.PAPER),
                new ItemStack(Material.EXPERIENCE_BOTTLE),
                new ItemStack(Material.EXPERIENCE_BOTTLE), new ItemStack(Material.EXPERIENCE_BOTTLE),
                new ItemStack(Material.EXPERIENCE_BOTTLE)
            });
    };
}