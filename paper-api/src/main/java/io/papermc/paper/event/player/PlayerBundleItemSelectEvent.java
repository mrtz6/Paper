package io.papermc.paper.event.player;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * Called when a {@link Player} selects an item inside a bundle.
 * <p>
 * NOTE: This event does not fire for bundle item selections in creative mode player inventories.
 */
@NullMarked
public final class PlayerBundleItemSelectEvent extends PlayerEvent {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final ItemStack bundle;
    private final ItemStack selectedItem;
    private final int selectedIndex;

    @ApiStatus.Internal
    public PlayerBundleItemSelectEvent(final Player player, final ItemStack bundle, final ItemStack selectedItem, final int selectedIndex) {
        super(player);

        this.bundle = bundle;
        this.selectedItem = selectedItem;
        this.selectedIndex = selectedIndex;
    }

    /**
     * Gets the bundle item.
     *
     * @return the bundle item
     */
    public ItemStack getBundle() {
        return this.bundle;
    }

    /**
     * Gets the selected item inside the bundle.
     *
     * @return the selected item
     */
    public ItemStack getSelectedItem() {
        return this.selectedItem;
    }

    /**
     * Gets the selected index.
     *
     * @return the selected index
     */
    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
