package jackyy.exchangers.item.thermalexpansion;

import jackyy.exchangers.item.ItemExchangerBasePowered;
import jackyy.exchangers.registry.ModConfig;
import jackyy.exchangers.util.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.IRarity;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemSignalumExchanger extends ItemExchangerBasePowered {

    public ItemSignalumExchanger() {
        setRegistryName(Reference.MODID + ":signalum_exchanger");
        setTranslationKey(Reference.MODID + ".signalum_exchanger");
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    @Override
    public int getMaxEnergy() {
        return ModConfig.thermalExpansionTweaks.signalumMaxEnergy;
    }

    @Override
    public int getPerBlockUse() {
        return ModConfig.thermalExpansionTweaks.signalumPerBlockUse;
    }

    @Override
    public boolean checkLoaded() {
        return ModConfig.modules.thermalExpansionModule && Loader.isModLoaded(Reference.TE);
    }

    @Override
    public int getTier() {
        return 4;
    }

    @Override
    public int getHarvestLevel() {
        return ModConfig.thermalExpansionTweaks.signalumMaxHarvestLevel;
    }

    @Override
    public int getMaxRange() {
        return ModConfig.thermalExpansionTweaks.signalumMaxRange;
    }

    @Override
    public IRarity getForgeRarity(ItemStack stack) {
        return EnumRarity.EPIC;
    }

}
