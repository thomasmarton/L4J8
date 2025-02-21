package no.stelar7.api.l4j8.pojo.staticdata.summonerspell;

import java.io.Serializable;
import java.util.Map;

public class StaticSummonerSpellList implements Serializable
{
    private static final long serialVersionUID = -9207694968560326878L;
    
    private Map<Integer, StaticSummonerSpell> data;
    
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
        final StaticSummonerSpellList other = (StaticSummonerSpellList) obj;
        if (this.data == null)
        {
            return other.data == null;
        } else
        {
            return this.data.equals(other.data);
        }
        
    }
    
    /**
     * Gets the data.
     *
     * @return the data
     */
    public Map<Integer, StaticSummonerSpell> getData()
    {
        return this.data;
    }
    
    @Override
    public int hashCode()
    {
        final int prime  = 31;
        int       result = 1;
        result = (prime * result) + ((this.data == null) ? 0 : this.data.hashCode());
        result = (prime * result) + super.hashCode();
        return result;
    }
    
    @Override
    public String toString()
    {
        return "StaticSummonerSpellList{" +
               "data=" + data +
               '}';
    }
}
