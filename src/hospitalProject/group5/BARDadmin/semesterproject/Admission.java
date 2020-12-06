/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterproject;

import java.time.LocalDateTime;

/**
 *
 * @author dante
 */
public class Admission {
    private int
            id,
            patient,
            appointment,
            room,
            bed,
            discharge;
    private String adm_notes;
    private LocalDateTime adm_date;
    private boolean discharged;
}
