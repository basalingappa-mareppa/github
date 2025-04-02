import{test,expect} from '@playwright/test'
test(sample,async({page})=>{
    await page.goto('https://www.redbus.in/')
    await page.click('.name_rb_secondary_item');
    await page.click('.header_dropdown_item_name');
})