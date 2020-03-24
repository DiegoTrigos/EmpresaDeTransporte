public class Camion
{
private String matricula;

  private int capacidad;
 private double consumo;

   private int cargaActual;

  public Camion( String matricula, int capacidad, double consumo )
    {
        this.matricula = matricula;
        this.capacidad = capacidad;
        this.consumo = consumo;
        this.cargaActual = 0;
    }

  public int getCapacidad( )
    {
        return capacidad;
    }

    public double getConsumo( )
    {
        return consumo;
    }

  public String getMatricula( )
    {
        return matricula;
    }

public int getCargaActual( )
    {
        return cargaActual;
    }

public boolean cargar( int pPesoCarga )
    {
        boolean cargo = false;
        if( pPesoCarga <= capacidad )
        {
            cargo = true;
            cargaActual = pPesoCarga;
        }
        return cargo;
    }

   public void descargar( )
    {
        cargaActual = 0;
    }

}