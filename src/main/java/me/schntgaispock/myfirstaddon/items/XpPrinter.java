package me.schntgaispock.myfirstaddon.items;

import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;

public class XpPrinter extends SlimefunItem {

    public XpPrinter(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Override
    public void preRegister() {
        addItemHandler((ItemUseHandler) this::onItemRightClick);
    }

    private void onItemRightClick(PlayerRightClickEvent event) {
        event.cancel();
        event.getPlayer().giveExpLevels(1);
    }
}