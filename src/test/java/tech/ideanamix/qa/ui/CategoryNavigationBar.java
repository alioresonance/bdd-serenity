/*
 * **********************************************************
 *  Copyright (c) 2020  Ideanamix, LLC.  All rights reserved.
 * **********************************************************
 */
package tech.ideanamix.qa.ui;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import tech.ideanamix.qa.model.Category;

public class CategoryNavigationBar extends PageObject {

    public void selectCategory(Category category) {
        $(".hl-cat-nav").
                find(By.linkText( category.name() )).
                click();
    }
}
