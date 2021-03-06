/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Quark Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Quark
 * 
 * Quark is Open Source and distributed under the
 * CC-BY-NC-SA 3.0 License: https://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB
 * 
 * File Created @ [28/08/2016, 00:37:40 (GMT)]
 */
package vazkii.quark.base.network;

import net.minecraftforge.fml.relauncher.Side;
import vazkii.arl.network.NetworkHandler;
import vazkii.quark.base.network.message.MessageChangeConfig;
import vazkii.quark.base.network.message.MessageDisableDropoffClient;
import vazkii.quark.base.network.message.MessageDoEmote;
import vazkii.quark.base.network.message.MessageDropoff;
import vazkii.quark.base.network.message.MessageFavoriteItem;
import vazkii.quark.base.network.message.MessageLinkItem;
import vazkii.quark.base.network.message.MessageRestock;
import vazkii.quark.base.network.message.MessageSwapItems;

public class MessageRegister {

	public static void init() {
		NetworkHandler.register(MessageDoEmote.class, Side.CLIENT);
		NetworkHandler.register(MessageDropoff.class, Side.SERVER);
		NetworkHandler.register(MessageSwapItems.class, Side.SERVER);
		NetworkHandler.register(MessageRestock.class, Side.SERVER);
		NetworkHandler.register(MessageFavoriteItem.class, Side.SERVER);
		NetworkHandler.register(MessageDisableDropoffClient.class, Side.CLIENT);	
		NetworkHandler.register(MessageLinkItem.class, Side.SERVER);
		NetworkHandler.register(MessageChangeConfig.class, Side.CLIENT);
	}
	
}
