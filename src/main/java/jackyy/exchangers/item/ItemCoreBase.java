package jackyy.exchangers.item;

import jackyy.exchangers.Exchangers;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemCoreBase extends Item {

    public ItemCoreBase(){
        setMaxStackSize(16);
        setCreativeTab(Exchangers.TAB);
    }

    @Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> list) {
        if (isInCreativeTab(tab)) {
            if (checkLoaded()) {
                list.add(new ItemStack(this));
            }
        }
    }

    public boolean checkLoaded() {
        return true;
    }

}