using System;

internal class ColumnAttribute : Attribute
{
    public bool IsPrimaryKey { get; set; }
}