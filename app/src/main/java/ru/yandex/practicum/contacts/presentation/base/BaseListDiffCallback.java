package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class BaseListDiffCallback<T extends ListDiffInterface<T>> extends DiffUtil.ItemCallback<T> {

    @Override
    public boolean areItemsTheSame(@NonNull final T oldItem, @NonNull final T newItem) {
        return oldItem.theSameAs(newItem);
    }

    @Override
    public boolean areContentsTheSame(@NonNull final T oldItem, @NonNull final T newItem) {
        return oldItem.equals(newItem);
    }

    @Override
    public Object getChangePayload(@NonNull final T oldItem, @NonNull final T newItem) {
        return newItem;
    }
}
