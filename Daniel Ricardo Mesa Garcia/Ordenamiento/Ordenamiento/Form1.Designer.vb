<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form reemplaza a Dispose para limpiar la lista de componentes.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Requerido por el Diseñador de Windows Forms
    Private components As System.ComponentModel.IContainer

    'NOTA: el Diseñador de Windows Forms necesita el siguiente procedimiento
    'Se puede modificar usando el Diseñador de Windows Forms.  
    'No lo modifique con el editor de código.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.Panel1 = New System.Windows.Forms.Panel()
        Me.Quitsort = New System.Windows.Forms.RadioButton()
        Me.Borbuja = New System.Windows.Forms.RadioButton()
        Me.Insercion = New System.Windows.Forms.RadioButton()
        Me.TxtNumero = New System.Windows.Forms.TextBox()
        Me.Button1 = New System.Windows.Forms.Button()
        Me.Label1 = New System.Windows.Forms.Label()
        Me.Panel1.SuspendLayout()
        Me.SuspendLayout()
        '
        'Panel1
        '
        Me.Panel1.Controls.Add(Me.Quitsort)
        Me.Panel1.Controls.Add(Me.Borbuja)
        Me.Panel1.Controls.Add(Me.Insercion)
        Me.Panel1.Location = New System.Drawing.Point(12, 12)
        Me.Panel1.Name = "Panel1"
        Me.Panel1.Size = New System.Drawing.Size(364, 50)
        Me.Panel1.TabIndex = 0
        '
        'Quitsort
        '
        Me.Quitsort.AutoSize = True
        Me.Quitsort.Location = New System.Drawing.Point(207, 18)
        Me.Quitsort.Name = "Quitsort"
        Me.Quitsort.Size = New System.Drawing.Size(75, 17)
        Me.Quitsort.TabIndex = 2
        Me.Quitsort.TabStop = True
        Me.Quitsort.Text = "Quick Sort"
        Me.Quitsort.UseVisualStyleBackColor = True
        '
        'Borbuja
        '
        Me.Borbuja.AutoSize = True
        Me.Borbuja.Location = New System.Drawing.Point(106, 18)
        Me.Borbuja.Name = "Borbuja"
        Me.Borbuja.Size = New System.Drawing.Size(61, 17)
        Me.Borbuja.TabIndex = 1
        Me.Borbuja.TabStop = True
        Me.Borbuja.Text = "Borbuja"
        Me.Borbuja.UseVisualStyleBackColor = True
        '
        'Insercion
        '
        Me.Insercion.AutoSize = True
        Me.Insercion.Location = New System.Drawing.Point(13, 18)
        Me.Insercion.Name = "Insercion"
        Me.Insercion.Size = New System.Drawing.Size(74, 17)
        Me.Insercion.TabIndex = 0
        Me.Insercion.TabStop = True
        Me.Insercion.Text = "Inserccion"
        Me.Insercion.UseVisualStyleBackColor = True
        '
        'TxtNumero
        '
        Me.TxtNumero.Location = New System.Drawing.Point(169, 84)
        Me.TxtNumero.Name = "TxtNumero"
        Me.TxtNumero.Size = New System.Drawing.Size(54, 20)
        Me.TxtNumero.TabIndex = 1
        '
        'Button1
        '
        Me.Button1.Location = New System.Drawing.Point(247, 80)
        Me.Button1.Name = "Button1"
        Me.Button1.Size = New System.Drawing.Size(68, 27)
        Me.Button1.TabIndex = 2
        Me.Button1.Text = "Comenzar"
        Me.Button1.UseVisualStyleBackColor = True
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(22, 87)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(132, 13)
        Me.Label1.TabIndex = 3
        Me.Label1.Text = "Digite la cantidad numeros"
        '
        'Form1
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(389, 136)
        Me.Controls.Add(Me.Label1)
        Me.Controls.Add(Me.Button1)
        Me.Controls.Add(Me.TxtNumero)
        Me.Controls.Add(Me.Panel1)
        Me.Name = "Form1"
        Me.Text = "Form1"
        Me.Panel1.ResumeLayout(False)
        Me.Panel1.PerformLayout()
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub

    Friend WithEvents Panel1 As Panel
    Friend WithEvents Quitsort As RadioButton
    Friend WithEvents Borbuja As RadioButton
    Friend WithEvents Insercion As RadioButton
    Friend WithEvents TxtNumero As TextBox
    Friend WithEvents Button1 As Button
    Friend WithEvents Label1 As Label
End Class
