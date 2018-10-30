using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

// Tabla que quieres asociar con la entidad
[Table(Name = "Customer")]
public class Customer
{
    // Columnas en la base de datos. Debe tener el mismo nombre entre la base de datos y la variable de clase.
    [Column(IsPrimaryKey = true)]
    public int row_id { get; set; }

    [Column]
    public string Nombre { get; set; }

    [Column]
    public int Edad { get; set; }

}

// Esta es esencialmente la conexión a su base de datos. Se maneja generando sentencias SQL y
// creando objetos a partir de esas sentencias SQL (si son consultas)
public class MyDatabase : DataContext
{
    public Table<Customer> customerTable;
    public MyDatabase(string connection) : base(connection) { }
}

// Esto realmente recupera los datos por ti. ¡Mira qué corto y dulce es después de configurar lo anterior!
public static class DBHelper
{
    public static List<Customer> RetrieveAllCustomers()
    {
        MyDatabase db = new MyDatabase(GetConnectionString());

        var customers = db.customerTable.Select(row => row);

       

        return customers.ToList();
    }

    private static string GetConnectionString()
    {
        throw new NotImplementedException();
    }
}

