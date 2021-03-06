package jackyy.exchangers.item.enderio;

import jackyy.exchangers.item.ItemExchangerBasePowered;
import jackyy.exchangers.registry.ModConfig;
import jackyy.exchangers.util.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.IRarity;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemConductiveIronExchanger extends ItemExchangerBasePowered {

    public ItemConductiveIronExchanger() {
        setRegistryName(Reference.MODID + ":conductive_iron_exchanger");
        setTranslationKey(Reference.MODID + ".conductive_iron_exchanger");
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    @Override
    public int getMaxEnergy() {
        return ModConfig.enderIOTweaks.conductiveMaxEnergy;
    }

    @Override
    public int getPerBlockUse() {
        return ModConfig.enderIOTweaks.conductivePerBlockUse;
    }

    @Override
    public boolean checkLoaded() {
        return ModConfig.modules.enderIOModule && Loader.isModLoaded(Reference.EIO);
    }

    @Override
    public int getTier() {
        return 1;
    }

    @Override
    public int getHarvestLevel() {
        return ModConfig.enderIOTweaks.conductiveMaxHarvestLevel;
    }

    @Override
    public int getMaxRange() {
        return ModConfig.enderIOTweaks.conductiveMaxRange;
    }

    @Override
    public IRarity getForgeRarity(ItemStack stack) {
        return Reference.TIER_1;
    }

}
