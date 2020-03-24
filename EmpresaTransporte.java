
public class EmpresaTransporte
{
    private Camion camion1;
    private Camion camion2;
    private Camion camion3;
    private Camion camion4;

    public EmpresaTransporte( )
    {
        camion1 = new Camion( "BAC213", 140, 29 );
        camion2 = new Camion( "CAP384", 110, 76 );
        camion3 = new Camion( "GER273", 50, 150 );
        camion4 = new Camion( "JKV232", 205, 210 );

    }

    public Camion getCamion1( )
    {
        return camion1;
    }

    public Camion getCamion2( )
    {
        return camion2;
    }

    public Camion getCamion3( )
    {
        return camion3;
    }

    public Camion getCamion4( )
    {
        return camion4;
    }

    public boolean cargarCamion( String pMatricula, int pPesoCarga )
    {
        boolean cargo = false;
        if( camion1.getMatricula( )==( pMatricula ) )
        {
            cargo = camion1.cargar( pPesoCarga );
        }
        else if( camion2.getMatricula( )==( pMatricula ) )
        {
            cargo = camion2.cargar( pPesoCarga );
        }
        else if( camion3.getMatricula( )==( pMatricula ) )
        {
            cargo = camion3.cargar( pPesoCarga );
        }
        else if( camion4.getMatricula( )==( pMatricula ) )
        {
            cargo = camion4.cargar( pPesoCarga );
        }
        return cargo;
    }

    public void descargarCamion( String pMatricula )
    {
        if( camion1.getMatricula( )==( pMatricula ) )
        {
            camion1.descargar( );
        }
        else if( camion2.getMatricula( )==( pMatricula ) )
        {
            camion2.descargar( );
        }
        else if( camion3.getMatricula( )==( pMatricula ) )
        {
            camion3.descargar( );
        }
        else if( camion4.getMatricula( )==( pMatricula ) )
        {
            camion4.descargar( );
        }
    }

    public int getCapacidadTotal( )
    {
        return camion1.getCapacidad( ) + camion2.getCapacidad( ) + camion3.getCapacidad( ) + camion4.getCapacidad( );
    }

    public int getCargaTotal( )
    {
        return camion1.getCargaActual( ) + camion2.getCargaActual( ) + camion3.getCargaActual( ) + camion4.getCargaActual( );
    }

    public double calcularCargaPromedio( )
    {
        double promedio = ( double ) ( getCargaTotal( ) / 4 );
        return promedio;
    }

    public Camion getMejorCamion( int pPesoCarga )
    {
        Camion mejor = null;
        if( camion1.getCapacidad( ) >= pPesoCarga )
        {
            mejor = camion1;
        }
        if( camion2.getCapacidad( ) >= pPesoCarga && camion2.getConsumo( ) < mejor.getConsumo( ) )
        {
            mejor = camion2;
        }
        if( camion3.getCapacidad( ) >= pPesoCarga && camion3.getConsumo( ) < mejor.getConsumo( ) )
        {
            mejor = camion3;
        }
        if( camion4.getCapacidad( ) >= pPesoCarga && camion4.getConsumo( ) < mejor.getConsumo( ) )
        {
            mejor = camion4;
        }
        return mejor;
    }
}