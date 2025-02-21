package no.stelar7.api.l4j8.impl.raw;

import no.stelar7.api.l4j8.basic.calling.*;
import no.stelar7.api.l4j8.basic.constants.api.*;
import no.stelar7.api.l4j8.basic.utils.Pair;
import no.stelar7.api.l4j8.pojo.spectator.*;

import java.util.*;

@SuppressWarnings("unchecked")
public final class SpectatorAPI
{
    
    private static final SpectatorAPI INSTANCE = new SpectatorAPI();
    
    public static SpectatorAPI getInstance()
    {
        return SpectatorAPI.INSTANCE;
    }
    
    private SpectatorAPI()
    {
        // Hide public constructor
    }
    
    
    /**
     * The response object contains the FeaturedGames on the platform.
     *
     * @param server the region to execute against
     * @return Optional FeaturedGames
     */
    public List<SpectatorGameInfo> getFeaturedGames(Platform server)
    {
        DataCallBuilder builder = new DataCallBuilder().withEndpoint(URLEndpoint.V3_SPECTATOR_FEATURED)
                                                       .withPlatform(server);
        
        try
        {
            
            Object data = builder.build();
            if (data instanceof Pair)
            {
                return Collections.emptyList();
            }
            
            FeaturedGames fg = (FeaturedGames) data;
            return fg.getGameList();
        } catch (ClassCastException e)
        {
            return Collections.emptyList();
        }
    }
    
    /**
     * The response object contains the CurrentGame of the summoner.
     * <p>
     * returns null if not in game
     *
     * @param server     the region to execute against
     * @param summonerId the summonerId
     * @return SpectatorGameInfo
     */
    public SpectatorGameInfo getCurrentGame(Platform server, String summonerId)
    {
        DataCallBuilder builder = new DataCallBuilder().withURLParameter(Constants.SUMMONER_ID_PLACEHOLDER, summonerId)
                                                       .withEndpoint(URLEndpoint.V3_SPECTATOR_CURRENT)
                                                       .withPlatform(server);
        
        try
        {
            SpectatorGameInfo fg = (SpectatorGameInfo) builder.build();
            return fg;
        } catch (ClassCastException e)
        {
            return null;
        }
    }
}
