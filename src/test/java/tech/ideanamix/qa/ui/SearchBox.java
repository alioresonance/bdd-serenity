/*
 * **********************************************************
 *  Copyright (c) 2020  Ideanamix, LLC.  All rights reserved.
 * **********************************************************
 */
package tech.ideanamix.qa.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchBox {
    public static Target SEARCH_FIELD = Target.the("search field").located(By.name("q"));
}
