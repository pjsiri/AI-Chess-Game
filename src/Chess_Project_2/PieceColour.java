/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Chess_Project_2;

/**
 *
 * @author User
 */
public enum PieceColour {
    BLACK,
    WHITE;
    
    public PieceColour getOppColour() 
    {
        if (this == BLACK) 
        {
            return WHITE;
        } 
        else 
        {
            return BLACK;
        }
    }
}
