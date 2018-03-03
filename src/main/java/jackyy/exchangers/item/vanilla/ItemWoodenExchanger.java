package jackyy.exchangers.item.vanilla;

import jackyy.exchangers.Exchangers;
import jackyy.exchangers.item.ItemExchangerBase;
import jackyy.exchangers.registry.ModConfig;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemWoodenExchanger extends ItemExchangerBase {

    public ItemWoodenExchanger(){
        setRegistryName(Exchangers.MODID + ":wooden_exchanger");
        setUnlocalizedName(Exchangers.MODID + ".wooden_exchanger");
        setMaxDamage(ModConfig.vanillaTweaks.woodMaxDmg);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    @Override
    public int getTier() {
        return 1;
    }

    @Override
    public int getHarvestLevel() {
        return 0;
    }

    @Override
    public int getMaxRange() {
        return MODE_1X1;
    }

    @Override
    public boolean checkLoaded() {
        return ModConfig.modules.vanillaModule;
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return Exchangers.TIER_1;
    }

}
