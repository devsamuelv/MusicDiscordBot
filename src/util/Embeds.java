package util;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.entities.MessageEmbed.Field;

public class Embeds {
    
    private EmbedBuilder builder = new EmbedBuilder();

    public MessageEmbed NotFinishedEmbed() {
        builder.setAuthor("MusicDiscordBot");
        builder.addField(new Field("Test", "test", true));

        return builder.build();
    }

}