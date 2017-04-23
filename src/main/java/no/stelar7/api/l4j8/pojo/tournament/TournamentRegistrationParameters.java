package no.stelar7.api.l4j8.pojo.tournament;

public class TournamentRegistrationParameters
{
    private String name;
    private Long   providerId;
    
    public TournamentRegistrationParameters(final Long providerId)
    {
        super();
        this.providerId = providerId;
    }
    
    public TournamentRegistrationParameters(final String name, final long providerId2)
    {
        super();
        this.name = name;
        this.providerId = providerId2;
    }
    
    
    @Override
    public boolean equals(final Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (this.getClass() != obj.getClass())
        {
            return false;
        }
        final TournamentRegistrationParameters other = (TournamentRegistrationParameters) obj;
        if (this.name == null)
        {
            if (other.name != null)
            {
                return false;
            }
        } else if (!this.name.equals(other.name))
        {
            return false;
        }
        if (this.providerId == null)
        {
            if (other.providerId != null)
            {
                return false;
            }
        } else if (!this.providerId.equals(other.providerId))
        {
            return false;
        }
        return true;
    }
    
    /**
     * The optional name of the tournament.
     */
    public String getName()
    {
        return this.name;
    }
    
    public void setName(final String name)
    {
        this.name = name;
    }
    
    /**
     * The provider ID to specify the regional registered provider data to associate this tournament.
     */
    public Long getProviderId()
    {
        return this.providerId;
    }
    
    public void setProviderId(final Long providerId)
    {
        this.providerId = providerId;
    }
    
    @Override
    public int hashCode()
    {
        final int prime  = 31;
        int       result = 1;
        result = (prime * result) + ((this.name == null) ? 0 : this.name.hashCode());
        result = (prime * result) + ((this.providerId == null) ? 0 : this.providerId.hashCode());
        return result;
    }
    
    @Override
    public String toString()
    {
        return "TournamentRegistrationParameters [name=" + this.name + ", providerId=" + this.providerId + "]";
    }
}
