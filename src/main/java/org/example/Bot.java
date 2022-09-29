package org.example;

import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.Random;

public class Bot extends TelegramLongPollingBot {


    @Override
    public String getBotUsername() {
        return "@msk2000_bot";
    }

    @Override
    public String getBotToken() {
        return "5775448809:AAF--aPOv2kmgDJZUbgpnRYDYbyju427n6U";
    }

    @Override
    @SneakyThrows
    public void onUpdateReceived(Update update) {

        String[] kakaya = new String[100];
        kakaya[0] = "Ласковая";
        kakaya[1] = "Заботливая";
        kakaya[2] = "Честная";
        kakaya[3] = "Приветливая";
        kakaya[4] = "Верная";
        kakaya[5] = "Незаменимая";
        kakaya[6] = "Сильная";
        kakaya[7] = "Умная";
        kakaya[8] = "Сексапильная";
        kakaya[9] = "Милая";
        kakaya[10] = "Умопомрачительная";
        kakaya[11] = "Королевская";
        kakaya[12] = "Бодрая";
        kakaya[13] = "Всезнающая";
        kakaya[14] = "Коварная";
        kakaya[15] = "Модная";
        kakaya[16] = "Няшная";
        kakaya[17] = "Пушистая";
        kakaya[18] = "Сексуальная";
        kakaya[19] = "Желанная";
        kakaya[20] = "Шикарная";
        kakaya[21] = "Необычная";
        kakaya[22] = "Веселая";
        kakaya[23] = "Смешная";
        kakaya[24] = "Гордая";
        kakaya[25] = "Добролюбивая";
        kakaya[26] = "Искренняя";
        kakaya[27] = "Головокружительная";
        kakaya[28] = "Бесподобная";
        kakaya[29] = "Беспринципиальная";
        kakaya[30] = "Дорогая";
        kakaya[31] = "Значимая";
        kakaya[32] = "Незаменимая";
        kakaya[33] = "Миролюбивая";
        kakaya[34] = "Чистосердечная";
        kakaya[35] = "Непредсказуемая";
        kakaya[36] = "Соблазнительная";
        kakaya[37] = "Гордая";
        kakaya[38] = "Волшебная";
        kakaya[39] = "Божественная";
        kakaya[40] = "Сногсшибательная";
        kakaya[41] = "Привлекательная";
        kakaya[42] = "Стильная";
        kakaya[43] = "Трогательная";
        kakaya[44] = "Классная";
        kakaya[45] = "Правильная";
        kakaya[46] = "Заботливая";
        kakaya[47] = "Загадочная";
        kakaya[48] = "Напористая";
        kakaya[49] = "Добрая";
        kakaya[50] = "Любезная";
        kakaya[51] = "Неприступная";
        kakaya[52] = "Удачливая";
        kakaya[53] = "Чуткая";
        kakaya[54] = "Чрезвычайная";
        kakaya[55] = "Бесценная";
        kakaya[56] = "Остроумная";
        kakaya[57] = "Гениальная";
        kakaya[58] = "Открытая";
        kakaya[59] = "Грациозная";
        kakaya[60] = "Спортивная";
        kakaya[61] = "Вежливая";
        kakaya[62] = "Хозяйственная";
        kakaya[63] = "Галантная";
        kakaya[64] = "Ловкая";
        kakaya[65] = "Любопытная";
        kakaya[66] = "Неприступная";
        kakaya[67] = "Могучая";
        kakaya[68] = "Неимоверная";
        kakaya[69] = "Деловая";
        kakaya[70] = "Открытая";
        kakaya[71] = "Жгучая";
        kakaya[72] = "Неземная";
        kakaya[73] = "Бесценная";
        kakaya[74] = "Видная";
        kakaya[75] = "Ароматная";
        kakaya[76] = "Горячая";
        kakaya[77] = "Гламурная";
        kakaya[78] = "Естественная";
        kakaya[79] = "Забавная";
        kakaya[80] = "Золотая";
        kakaya[81] = "Звездная";
        kakaya[82] = "Искренняя";
        kakaya[83] = "Искрометная";
        kakaya[84] = "Медовая";
        kakaya[85] = "Модняшка";
        kakaya[86] = "Неординарная";
        kakaya[87] = "Новая";
        kakaya[88] = "Няшная";
        kakaya[89] = "Обаятельная";
        kakaya[90] = "Огненная";
        kakaya[91] = "Прилежная";
        kakaya[92] = "Праздничная";
        kakaya[93] = "Ритмичная";
        kakaya[94] = "Стройная";
        kakaya[95] = "Сумасшедшая";
        kakaya[96] = "Терпеливая";
        kakaya[97] = "Хозяйственная";
        kakaya[98] = "Чудная";
        kakaya[99] = "Экстравагантная";
        Random random = new Random();
        int i = random.nextInt(0, 99);
        if (update.hasMessage()) {
            Message message = update.getMessage();
            String slova = message.getText();
            String masha = "Маша";
            if (slova.contains(masha)) {
                execute(SendMessage
                        .builder()
                        .chatId(message.getChatId().toString())
                        .text(kakaya[i]).build());
            }
        }
    }

    @SneakyThrows
    public static void main(String[] args) {
        Bot bot = new Bot();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(bot);
    }

}