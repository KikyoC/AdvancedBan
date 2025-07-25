package me.leoko.advancedban.velocity.listener;

import com.velocitypowered.api.event.PostOrder;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.player.PlayerChatEvent;
import me.leoko.advancedban.Universal;

public class  ChatListenerVelocity {

    @Subscribe(order = PostOrder.FIRST)
    public void onChat(PlayerChatEvent event) {
        if (Universal.get().getMethods().callCMD(event.getPlayer(), event.getMessage())) {
            event.setResult(PlayerChatEvent.ChatResult.denied());
        }
    }

}
